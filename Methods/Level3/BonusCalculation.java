class BonusCalculator {
    public static void main(String[] args){
        double[][] data=new double[10][4];
        double sumOld=0,sumNew=0,sumBonus=0;
        for(int i=0;i<10;i++){
            int salary=10000+(int)(Math.random()*90000);
            int yrs=(int)(Math.random()*10)+1;
            double bonus=salary*(yrs>5?0.05:0.02);
            double newSal=salary+bonus;
            data[i][0]=salary;data[i][1]=yrs;data[i][2]=bonus;data[i][3]=newSal;
            sumOld+=salary;sumNew+=newSal;sumBonus+=bonus;
        }
        for(double[] row:data)System.out.println("Old:"+row[0]+" Years:"+row[1]+" Bonus:"+row[2]+" New:"+row[3]);
        System.out.println("Sum Old:"+sumOld+" Sum New:"+sumNew+" Total Bonus:"+sumBonus);
    }
}
