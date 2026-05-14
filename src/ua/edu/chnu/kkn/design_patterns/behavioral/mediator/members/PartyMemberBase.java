package ua.edu.chnu.kkn.design_patterns.behavioral.mediator.members;

import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.Action;
import ua.edu.chnu.kkn.design_patterns.behavioral.mediator.Party;

public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
