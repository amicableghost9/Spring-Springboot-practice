package Demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName ="prototype" )

public class Doctor implements Staff
{

    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

   public void setNurse(Nurse nurse) {
       this.nurse = nurse;
    }

    private String qualification;

    public String getQualification() {
       return qualification;
   }

    public void setQualification(String qualification) {
      this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void assist()
    {
        System.out.println("assisting");

    }


}
