package labassignment5;

import java.util.List;

class Job {
    private int jobNumber;
    private Address location;
    private String description;
    private List<Equipment> requiredEquipment;
    private Date plannedDate;
    private static int jobTotal;

    static {
        jobTotal = 0;
    }

    public Job(Address location, String description, List<Equipment> requiredEquipment, Date plannedDate) {
        this.jobNumber = ++jobTotal;
        this.location = location;
        this.description = description;
        this.requiredEquipment = requiredEquipment;
        this.plannedDate = plannedDate;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public Address getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public List<Equipment> getRequiredEquipment() {
        return requiredEquipment;
    }

    public Date getPlannedDate() {
        return plannedDate;
    }

    public static int getJobTotal() {
        return jobTotal;
    }

    public String toString() {
        String requirementsString = "";
        for (Equipment e : requiredEquipment) requirementsString += e.toString() + ", ";
        return String.format("<Job %d: %s. %s, %s. requiredEquipment: %s>", jobNumber, description, plannedDate, location, requirementsString.substring(0, requirementsString.length() - 2));
    }

    public boolean equals(Object o) {
        if (o instanceof Job other)
            return this == other ||
                location.equals(other.location) &&
                        description.equals(other.description) &&
                        requiredEquipment.equals(other.requiredEquipment) &&
                        plannedDate.equals(other.plannedDate);
        else return false;
    }
}
