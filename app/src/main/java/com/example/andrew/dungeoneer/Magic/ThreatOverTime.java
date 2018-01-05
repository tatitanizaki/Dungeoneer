package com.example.andrew.dungeoneer.Magic;
import com.example.andrew.dungeoneer.Characters.Archetypes.Character;

public class ThreatOverTime implements ITick {

    Character target;
    Character attacker;
    Integer threatPerTick;
    Integer duration;

    public ThreatOverTime(Character target, Character attacker, Integer threatPerTick, Integer duration) {
        this.target = target;
        this.attacker = attacker;
        this.threatPerTick = threatPerTick;
        this.duration = duration;
    }

    public Character getTarget() {
        return this.target;
    }

    public double getThreatPerTick() {
        return this.threatPerTick;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void tick(){
        if (duration <=0) {
            return;
        }
        else
        {
            attacker.increaseThreat(threatPerTick, target);
        setDuration(duration -1);
        }
    }


}
