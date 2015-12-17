import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Project5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String[] dictionary = new String[1000000];
		String[] error = new String[10000];
		String dictionaryFile = null;
		Boolean input = true;
		String student = null;
		int lengthd = 0;
		int count1 = 0;
		Boolean d=null;
		do {
			try {

				System.out.print("Please specify the name of the file that contains the dictionary information.\n");
				dictionaryFile = console.nextLine();
				java.io.File diction = new java.io.File(dictionaryFile + ".txt");
				Scanner sconsole = new Scanner(diction);
				System.out.println("File opened successfully!");
				int i = 0;
				do {
					dictionary[i] = sconsole.nextLine();
					i++;
				} while (sconsole.hasNextLine());
				lengthd = i;
				// System.out.print(i);
				input = false;
				sconsole.close();
			} catch (Exception FileNotFoundException) {
				System.out.println("File " + dictionaryFile + " cannot be found!");
			}
		} while (input);

		do {
			try {

				System.out.print("Please specify the ID of the student whose essay will be graded.\n");
				student = console.nextLine();
				if(student.equals("Finish")){
					break;
				}
				java.io.File studentf = new java.io.File(student + ".txt");
				Scanner sconsole = new Scanner(studentf);
				System.out.println("File opened successfully!");
				String[] context = new String[10000000];
				int i = 0;
				while (sconsole.hasNext()) {
					context[i] = sconsole.useDelimiter("\\W+").next();
					i++;
				}
				sconsole.close();
				int length = i;
//				for (i = 0; i <= length - 1; i++) {
//					context[i] = context[i].replaceAll("[\\W]", "");
//				}
				

				if (context[0].equals("HighSchool")) {
					int a = 0;// Original array

					HighSchoolStudent sunny = new HighSchoolStudent(context[2] + " " + context[3],
							Integer.parseInt(context[4]), context[5] + " " + context[0]);
					for (i = 8; i <= length - 1; i++) {
						count1 = 0;
						for (int j = 0; j <= lengthd - 1; j++) {

							if (!dictionary[j].equalsIgnoreCase(context[i])) {
								count1++;
							}
						}

						if (count1 == lengthd) {
							for(int c =0; c<=a; c++){
								d = true;
								if(!context[i].equals(error[c])){
									d=false;
								}else{
									break;
								}
							}
							if(d==false){
						    error[a] = context[i];
							a++;}
						}
					}
					File sunnyf = new File(student + "_graded" + ".txt");
					PrintWriter consolef = new PrintWriter(sunnyf);
					sunny.setGrade(100 - a);
					sunny.setError(error);
					sunny.setCount(a);
					consolef.print(sunny.toString());
					consolef.close();

				} else if (context[0].equals("Graduate")) {
					int a = 0;
					GraduateStudent sunny = new GraduateStudent(context[2] + " " + context[3],
							Integer.parseInt(context[4]), context[5] + " " + context[6], context[7] + " " + context[8]);
					for (i = 10; i <= length - 1; i++) {
						count1 = 0;
						for (int j = 0; j <= lengthd - 1; j++) {

							if (!dictionary[j].equalsIgnoreCase(context[i])) {
								count1++;
							}
						}

						if (count1 == lengthd) {
							for(int c =0; c<=a; c++){
								d = true;
								if(!context[i].equals(error[c])){
									d=false;
								}else{
									break;
								}
							}
							if(d==false){
						    error[a] = context[i];
							a++;}
						}
					}
					File sunnyf = new File(student + "_graded" + ".txt");
					PrintWriter consolef = new PrintWriter(sunnyf);
					sunny.setGrade(100 - a * 5);
					sunny.setError(error);
					sunny.setCount(a);
					consolef.print(sunny.toString());
					consolef.close();
				} else if (context[0].equals("Undergraduate")) {
					int a = 0;
					UndergraduateStudent sunny = new UndergraduateStudent(context[2] + " " + context[3],
							Integer.parseInt(context[4]), context[5] + " " + context[6]);
					for (i = 8; i <= length - 1; i++) {
						count1 = 0;
						for (int j = 0; j <= lengthd - 1; j++) {

							if (!dictionary[j].equalsIgnoreCase(context[i])) {
								count1++;
							}
						}

						if (count1 == lengthd) {
							for(int c =0; c<=a; c++){
								d = true;
								if(!context[i].equals(error[c])){
									d=false;
								}else{
									break;
								}
							}
							if(d==false){
						    error[a] = context[i];
							a++;}
						}
					}
					File sunnyf = new File(student + "_graded" + ".txt");
					PrintWriter consolef = new PrintWriter(sunnyf);
					sunny.setGrade(100 - a * 3);
					sunny.setError(error);
					sunny.setCount(a);
					consolef.print(sunny.toString());
					consolef.close();
				}

			} catch (Exception FileNotFoundException) {
				System.out.println("File " + student + " cannot be found!");
			}

		} while (!student.equals("Finish"));
		console.close();

	}

}
