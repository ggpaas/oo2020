/**
 * PersonalCode
 */
public class PersonalCode {

    private String code = "50004110888";
public static void main(String[] args) {
    PersonalCode myCode = new PersonalCode();
    myCode.code = "48878949653";
    System.out.println(myCode.gender());
    System.out.println(myCode.getAge());
    }

    String getCode(){
        return this.code;
    }

    void setCode(String code){
        this.code = code;
    }

    String gender(){
        int firstnumber = Integer.parseInt(code.substring(0,1));
        String gender;
        if (firstnumber % 2 == 0){
            gender = "female";
        } else{
            gender = "male";
        }
        return gender;
    }

    public int getAge(){
        int firstnumber = Integer.parseInt(code.substring(0,1));
        int ageNumber = Integer.parseInt(code.substring(1,3));
        String year;        
        if(firstnumber == 2 || firstnumber == 3){
            return ageNumber;
        } else {
            return ageNumber;
        }

        //int number = Integer.parseInt("4");


    }
}
