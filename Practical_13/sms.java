class sms{
    static sms[][] database = new sms[100][10];
    static int cse, it, mech, chem, civil, textile, elec, instru, entc, prod;
    static int cse1, it1, mech1, chem1, civil1, textile1, elec1, instru1, entc1, prod1;

    String[] info;
    String name, branch, age, year_type;
    String reg_no, email;

    sms(String data){
        info = data.split(",");
        this.name = info[0];
        this.branch = info[1];
        this.age = info[2];
        this.year_type = info[3];

        if (year_type.toLowerCase().equals("regular")) {
            StringBuilder regBuilder = new StringBuilder("2023B");
            
            if (branch.equalsIgnoreCase("CSE")) {
                regBuilder.append("CS").append(String.format("%03d", ++cse));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[cse - 1][0] = this;
            } else if (branch.equalsIgnoreCase("IT")) {
                regBuilder.append("IT").append(String.format("%03d", ++it));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[it - 1][1] = this;
            } else if (branch.equalsIgnoreCase("MECH")) {
                regBuilder.append("ME").append(String.format("%03d", ++mech));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[mech - 1][2] = this;
            } else if (branch.equalsIgnoreCase("CHEM")) {
                regBuilder.append("CH").append(String.format("%03d", ++chem));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[chem - 1][3] = this;
            } else if (branch.equalsIgnoreCase("CIVIL")) {
                regBuilder.append("CE").append(String.format("%03d", ++civil));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[civil - 1][4] = this;
            } else if (branch.equalsIgnoreCase("TEXTILE")) {
                regBuilder.append("TE").append(String.format("%03d", ++textile));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[textile - 1][5] = this;
            } else if (branch.equalsIgnoreCase("ELEC")) {
                regBuilder.append("EL").append(String.format("%03d", ++elec));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[elec - 1][6] = this;
            } else if (branch.equalsIgnoreCase("INST")) {
                regBuilder.append("IN").append(String.format("%03d", ++instru));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[instru - 1][7] = this;
            } else if (branch.equalsIgnoreCase("ENTC")) {
                regBuilder.append("EC").append(String.format("%03d", ++entc));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[entc - 1][8] = this;
            } else if (branch.equalsIgnoreCase("PRODUCTION")) {
                regBuilder.append("PR").append(String.format("%03d", ++prod));
                this.reg_no = regBuilder.toString();
                this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                database[prod - 1][9] = this;
                
            }
        }
            else if (year_type.toLowerCase().equals("dsy")) {
                StringBuilder regBuilder = new StringBuilder("2023B");
                
                if (branch.equalsIgnoreCase("CSE")) {
                    regBuilder.append("CS").append(String.format("%03d", ++cse1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[cse1 - 1][0] = this;
                } else if (branch.equalsIgnoreCase("IT")) {
                    regBuilder.append("IT").append(String.format("%03d", ++it1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[it1 - 1][1] = this;
                } else if (branch.equalsIgnoreCase("MECH")) {
                    regBuilder.append("ME").append(String.format("%03d", ++mech1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[mech1 - 1][2] = this;
                } else if (branch.equalsIgnoreCase("CHEM")) {
                    regBuilder.append("CH").append(String.format("%03d", ++chem1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[chem1 - 1][3] = this;
                } else if (branch.equalsIgnoreCase("CIVIL")) {
                    regBuilder.append("CE").append(String.format("%03d", ++civil1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[civil1 - 1][4] = this;
                } else if (branch.equalsIgnoreCase("TEXTILE")) {
                    regBuilder.append("TE").append(String.format("%03d", ++textile1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[textile1 - 1][5] = this;
                } else if (branch.equalsIgnoreCase("ELEC")) {
                    regBuilder.append("EL").append(String.format("%03d", ++elec1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[elec1 - 1][6] = this;
                } else if (branch.equalsIgnoreCase("INST")) {
                    regBuilder.append("IN").append(String.format("%03d", ++instru1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[instru1 - 1][7] = this;
                } else if (branch.equalsIgnoreCase("ENTC")) {
                    regBuilder.append("EC").append(String.format("%03d", ++entc1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[entc1 - 1][8] = this;
                } else if (branch.equalsIgnoreCase("PRODUCTION")) {
                    regBuilder.append("PR").append(String.format("%03d", ++prod1));
                    this.reg_no = regBuilder.toString();
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[prod1 - 1][9] = this;
                    
                }
            }
            System.out.println("\nName: " + this.name + "\nReg.No.: " + this.reg_no + "\nEmail: " + this.email + "\nBranch: " +
             this.branch.toUpperCase() + "\nAge: " + this.age + "\nYear type: " + this.year_type.toUpperCase());
        }
    
        public static void main(String[] args){
            if (args.length > 0) {
                for (int i = 0; i < args.length; i++) {
                    sms s = new sms(args[i]);
                }
            } else {
                System.out.println("No arguments provided.");
            }
        
    }
}

    

           
