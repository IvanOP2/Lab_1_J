package ua.edu.chnu.kkn.design_patterns.behavioral.mediator;

import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members.PartyMember;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (var member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }
}
