package drools.license;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import java.util.ArrayList;


public class App {


    public static void main(String[] args) {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();

        StatelessKieSession kSession = kContainer.newStatelessKieSession();

        ArrayList<Applicant> applicantList= new ArrayList<Applicant>();

        applicantList.add(new Applicant("Murali",19));
        applicantList.add(new Applicant("Lucky",20));
        applicantList.add(new Applicant("Setty",14));
        applicantList.add(new Applicant("Jakka",12));
        applicantList.add(new Applicant("banda",79));


        kSession.execute(applicantList);

    }

}
