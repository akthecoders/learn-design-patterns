package Template;

public abstract class Record {
    public void save() {
        this.validate();
        this.beforeSave();
    }

    public abstract void validate();
    public abstract void beforeSave();

}