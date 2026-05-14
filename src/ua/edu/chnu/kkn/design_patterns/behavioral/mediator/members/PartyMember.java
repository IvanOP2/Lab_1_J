package ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members;

import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.Action;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.Party;

public interface PartyMember {

    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);
}
