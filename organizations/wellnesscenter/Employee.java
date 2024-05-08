package assignment2.organizations.wellnesscenter;

public class Employee {
    private String name;
    private String role;
    private int experience;

    public Employee(String name, String role, int experience) {
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        if (experience != employee.experience) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return role != null ? role.equals(employee.role) : employee.role == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + experience;
        return result;
    }
}
