package DiseaseTest;


import model.Patient;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class DTest {
    public static void main(String[] args){
        try {
            KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("diseaserules");
            Set<String> ICD10= new HashSet<>();
            ICD10.add("R13.1"); ICD10.add("R13.19");ICD10.add("R13.12"); ICD10.add("R13.13"); ICD10.add("R13.14");
            Patient p= new Patient(ICD10, "Active", LocalDate.of(2022,06,30) );
            ksession.insert(p);

            ksession.fireAllRules();
            ksession.dispose();
            System.out.println(p);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}

