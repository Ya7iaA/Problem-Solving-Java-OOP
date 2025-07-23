public abstract class SharedData extends BaseEntity {

    private String phone;

    public SharedData(int id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public abstract void print();
}