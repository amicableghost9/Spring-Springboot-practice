package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");


       // Nurse doctor=context.getBean(Nurse.class);
       // doctor.assist();

       // Nurse doctor=(Nurse)context.getBean("nurse");
       // doctor.assist();

        //Staff staff=context.getBean(Doctor.class);
        //staff.assist();

        //Doctor doctor=context.getBean(Doctor.class);
        //System.out.println(doctor.getQualification());

        Doctor doctor=context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor doctor1=context.getBean(Doctor.class);
        System.out.println(doctor1);






    }
}
