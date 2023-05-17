public class TestLoadedDie {
    public static void main (String []args){
        int DieWins = 0;
        int DieWins2 = 0;
        Die D = new Die();
        LoadedDie L = new LoadedDie();
        final int MIN = 1;
        final int MAX =6;
        for (int x=0; x<1000; ++x){
            int randomNum = (MIN + (int)(Math.random() * MAX));
            D.setDie(randomNum);
            int randomNum2 = (MIN + (int)(Math.random() * MAX));
            D.setDie2(randomNum2);
    //        System.out.println(D.getDie());


//            int randomNumLoaded = (MIN + (int)(Math.random() * MAX));
//            L.setLoadedNum(randomNumLoaded);

            if (D.getDie()>D.getDie2()){
                ++DieWins;
            }

        }
        System.out.println("Two normal Dice: Die one wins " + DieWins + " out of 1000 Times");

        for (int x=0; x<1000; ++x){

            int randomNum = (MIN + (int)(Math.random() * MAX));
            D.setDie(randomNum);
//            System.out.println(D.getDie());

            final int MINLoaded = 2;
            final int MAXLoaded =6;
            int randomNumLoaded = (MINLoaded + (int)(Math.random() * MAXLoaded));
            L.setLoadedNum(randomNumLoaded);
//            System.out.println(L.getLoadedNum());
            if (D.getDie()>L.getLoadedNum()){
                ++DieWins2;
            }

        }

        System.out.println("with one die and one loaded die two, Die one wins " + DieWins2 + " out of 1000 Times");
    }


}
