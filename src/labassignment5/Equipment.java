package labassignment5;

abstract class Equipment {
    public String requirements;

    public Equipment(String requirements) {
        this.requirements = requirements;
    }

    public String getRequirements() {
        return requirements;
    }

    /*public boolean equals(Object other) {
        if (other == this) return true;
        else if (this.getClass() == other.getClass()) {
            Equipment otherEquipment = (Equipment) other;
            return requirements.equals(otherEquipment.requirements);
        }
        else return false;
    }*/
}

class ConcreteMixer extends Equipment {
    public ConcreteMixer(String requirements) {
        super(requirements);
    }

    public String toString() {
        return "<ConcreteMixer requires " + requirements + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConcreteMixer other) return this == other || requirements.equals(other.requirements);
        else return false;
    }
}

class JackHammer extends Equipment {
    public JackHammer(String requirements) {
        super(requirements);
    }

    public String toString() {
        return "<ConcreteMixer requires " + requirements + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JackHammer other) return this == other || requirements.equals(other.requirements);
        else return false;
    }
}

class ScaffoldingTower extends Equipment {
    public ScaffoldingTower(String requirements) {
        super(requirements);
    }

    public String toString() {
        return "<ConcreteMixer requires " + requirements + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScaffoldingTower other) return this == other || requirements.equals(other.requirements);
        else return false;
    }
}

class Torch extends Equipment {
    public Torch(String requirements) {
        super(requirements);
    }

    public String toString() {
        return "<ConcreteMixer requires " + requirements + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Torch other) return this == other || requirements.equals(other.requirements);
        else return false;
    }
}
