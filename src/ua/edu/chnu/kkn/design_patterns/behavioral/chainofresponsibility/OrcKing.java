package ua.edu.chnu.kkn.design_patterns.behavioral.chainofresponsibility;

import java.util.Comparator;
import java.util.List;

public class OrcKing {

    private final List<RequestHandler> handlers;

    public OrcKing(List<RequestHandler> handlers) {
        this.handlers = handlers;
    }

    public void makeRequest(Request req) {
        handlers.stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.canHandleRequest(req))
                .findFirst()
                .ifPresent(handler -> handler.handle(req));
    }
}
