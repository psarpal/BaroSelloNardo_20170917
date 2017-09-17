public class BaroSelloNardoPrint {
    
    private static final int bNumber = 3;
    private static final int sNumber = 5;
    private static final int nNumber = 7;
    
    private static final String bText = "Baro";
    private static final String sText = "Sello";
    private static final String bsText = "BaroSello";
    private static final String nText = "Nardo";
    private static final String bnText = "BaroNardo";
    private static final String snText = "SelloNardo";
    private static final String bsnText = "BaroSelloNardo";
    
    private static final String allText = "all";
    
    private static final String bColour = "VIOLET";
    private static final String sColour = "BLUE";
    private static final String bsColour = "GREEN";
    private static final String nColour = "YELLOW";
    private static final String bnColour = "ORANGE";
    private static final String snColour = "RED";
    private static final String bsnColour = "INDIGO";
    private static final String numberColour = "BLACK";
    
    private static final String bOutput = "output1";
    private static final String sOutput = "output2";
    private static final String bsOutput = "output3";
    private static final String nOutput = "output4";
    private static final String bnOutput = "output5";
    private static final String snOutput = "output6";
    private static final String bsnOutput = "output7";
    private static final String numberOutput = "output8";
    
    private static void printText(String text, String color, String output) {
        // TODO: implement code to print the text in specified colour and specified output
        System.out.println(text);
    }
    
    public static void main(String[] args) {
        
        String printOption = allText;
        if (args.length > 0 && (bText.equals(args[0]) ||sText.equals(args[0]) ||bsText.equals(args[0]) ||nText.equals(args[0]) ||bnText.equals(args[0]) ||snText.equals(args[0]) ||bsnText.equals(args[0]) ))
            printOption = args[0];
        
        for(int i = 0; i<=100; i++) {
            if(i==0)
                printText("0", numberColour, numberOutput);
            else if(i%bNumber==0 && i%sNumber==0 && i%nNumber==0) {
                if(printOption.equals(bsnText) || printOption.equals(allText)) {
                    printText(bsnText, bsnColour, bsnOutput);
                }
            } else if(i%bNumber==0 && i%sNumber==0 ) {
                if(printOption.equals(bsText) || printOption.equals(allText)) {
                    printText(bsText, bsColour, bsOutput);
                }
            } else if(i%bNumber==0 && i%nNumber==0 ) {
                if(printOption.equals(bnText) || printOption.equals(allText)) {
                    printText(bnText, bnColour, bnOutput);
                }
            }  else if(i%sNumber==0 && i%nNumber==0 ) {
                if(printOption.equals(snText) || printOption.equals(allText)) {
                    printText(snText, snColour, snOutput);
                }
                
            }  else if(i%bNumber==0) {
                if(printOption.equals(bText) || printOption.equals(allText)) {
                    printText(bText, bColour, bOutput);
                }
            }  else if(i%sNumber==0) {
                if(printOption.equals(sText) || printOption.equals(allText)) {
                    printText(sText, sColour, sOutput);
                }
            } else if(i%nNumber==0) {
                if(printOption.equals(nText) || printOption.equals(allText)) {
                    printText(nText, nColour, nOutput);
                }
            } else {
                printText(String.valueOf(i), numberColour, numberOutput);
            }
        }
    }
}

