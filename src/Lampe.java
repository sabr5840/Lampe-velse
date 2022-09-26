public class Lampe {

        //Du skal lave en klasse der kan repræsentere en lampe –
        // en lampe kan enten være tændt eller slukket, så klassen skal
        // kunne huske sin “state” som tændt eller slukket, og
        // have tre metoder: en til at tænde, en til at slukke og en til at skifte.
        // Og en fjerde metode der fortæller om den er tændt.

        // opg 1 - lav en attribut der indeholder lampens navn.
        private String navn;

        // opg 2 - lav boolen instansvariabel der angiver om lampen er tændt eller slukket.
        private boolean tændt;

         //opg. 3 - Lav en konstruktør hvor man kan vælge om lampen fra start skal være tændt eller slukket
        public Lampe(String navn, boolean tændt){
            this.navn = navn;
            this.tændt = tændt;}

        // opg 4 - lav en konstruktør hvor man kun angiver navnet, og ikke kan angive at lampen skal være tændt – så den er slukket fra start.
        public Lampe(String navn){
        this.navn = navn;
        this.tændt = false;}

        // opg 5 - lav en metode turnOn der tænder lampen og en metode turnOff der slukker lampen
         public void turnOn (){
            tændt = true;}

         public void turnOff (){
            tændt = false;}

        // opg 6 - lav en metode toggle der tænder lampen hvis den var slukket, eller slukker den hvis den var tændt
         public void toggle (){
            if (!tændt)
                tændt =true;

            else
                tændt=false;}

        // opg 7 - lav en metode isOn der returnerer true hvis lampen var tændt
        public boolean isOn (){
            return tændt;}

    public String toString(){
            String text;
            if (tændt)
                text  = " tændt";
            else
                text = " slukket";
            return navn + " er" + text;


    }

}

