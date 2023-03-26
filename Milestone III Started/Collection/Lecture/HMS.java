import java.util.Scanner;

/**
 * HMS
 */
public class HMS 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        
        System.out.println("Welcome to the Hospital");
        String welcomeNote = sc.next();

        System.out.println();

        while (true) 
        {
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. List Patients");
            System.out.println("4. Exit");

               
        
        int choice = sc.nextInt(); 
        

        switch(choice)
        {
            case 1: System.out.println("Enter patient name: ");
                    String name = sc.next();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter gender M/F: ");
                    char gender = sc.next().charAt(0);
                    System.out.println("Enter illness: ");
                    String illness = sc.next();

                    Patient patient = new Patient(name, age, gender, illness);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully!");
  
                    break;
            case 2: System.out.println("Enter patient name to remove: ");
                    String nameToRemove = sc.next();
                    hospital.removePatient(nameToRemove);
                    System.out.println("Patient name removed successfully!");
                    break;
            case 3: System.out.println("List of Patients");
                    hospital.listPatients();
                    break;
            case 4: System.exit(0);
                    break;
            default:System.out.println("Invalid Choice!");
            break;
            }
            
        }
    }
}


    class Patient
    {
        String name;
        int age;
        char gender;
        String illness;

        public Patient(String name, int age, char gender, String illness)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.illness = illness;
        }

        public String getName()
        {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getGender() {
            return gender;
        }

        public String getIllness() {
            return illness;
        }
        
        @Override
        public String toString()
        {
            return "Name: "+ name +" Age: " + " Gender: " + " Illness: "+illness;
        }
        
    }
    


    class Hospital
    {
        private Patient [] patients;
        private int count;

        public Hospital()
        {
            patients = new Patient[100];
            count = 0;
        }

        public void addPatient(Patient patient)
        {
            patients[count++] = patient;
        }
        
        public void removePatient(String name)
        {
            for(int i=0; i<count; i++)
            {
                if(patients[i].getName().equalsIgnoreCase(name))
                {
                    patients[i]=null;
                    count--;

                    for(int j=i; j<count; j++)
                    {
                        patients[j] = patients[j+1];
                    }
                    break;
                }
            }
        }

        public void listPatients()
        {
            for(int i=0; i<count; i++)
            {
                System.out.println(patients[i]);
            }
        }
    }

    
    
    