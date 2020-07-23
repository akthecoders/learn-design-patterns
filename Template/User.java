package Template;

public class User extends Record {

    @Override
    public void validate() {
        // TODO Auto-generated method stub
        System.out.println("Validating");
    }

    @Override
    public void beforeSave() {
        // TODO Auto-generated method stub
        System.out.println("Before Save operations");
    }
    
}