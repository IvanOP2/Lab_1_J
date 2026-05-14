package ua.edu.chnu.kkn.design_patterns.behavioral.mediator;

import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members.PartyMember;

public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);
}
