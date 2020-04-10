package com.example.temasoundbar.services;

import com.example.temasoundbar.R;

public class ConstantsWorker {

    private static String[] buttonsNames = {"blyat.m4a",
            "die motherfucker.m4a", "eeeeee.m4a", "fuck.m4a",
            "fucking animal.m4a", "how ar eyou.m4a", "i wil lfind you.m4a",
            "lay.m4a", "molotkom po ebalu.m4a", "no no no.m4a",
            "nuclear reactor.m4a", "nu da nu da.m4a", "nu smotri.m4a",
            "oh fuck.m4a", "oh fuck2.m4a", "rebyat.m4a",
            "screeeeeam.m4a", "sharaga.m4a", "skatyna ebanaya.m4a",
            "so listen.m4a", "stupid cheater.m4a", "surrender.m4a",
            "tablyatski awaper.m4a", "ta yopto.m4a", "this is shit not a solution.m4a",
            "try rust.m4a", "understood.m4a", "what the fuck motherfucker.m4a",
            "ya poshel.m4a", "yes yes yes.m4a", "you bledina.m4a",
            "you cant divide.m4a", "you were told to go.m4a"};



    public static String[] getAllButtonsNames(){
        String[] editedNames = new String[buttonsNames.length];

        for (int i = 0; i < buttonsNames.length; i++) {
            editedNames[i] = buttonsNames[i].replace(".m4a","");
        }
        return editedNames;
    }

    private static int[] getId(int i) {
        switch (i) {
            case 0:
                return new int[]{R.drawable.tema11_button, R.raw.blyat};
            case 1:
                return new int[]{R.drawable.tema1_button, R.raw.diemotherfucker};
            case 2:
                return new int[]{R.drawable.tema2_button, R.raw.eeeeee};
            case 3:
                return new int[]{R.drawable.tema3_button, R.raw.fuck};
            case 4:
                return new int[]{R.drawable.tema4_button, R.raw.fuckinganimal};
            case 5:
                return new int[]{R.drawable.tema5_button, R.raw.howareyou};
            case 6:
                return new int[]{R.drawable.tema6_button, R.raw.iwillfindyou};
            case 7:
                return new int[]{R.drawable.tema7_button, R.raw.lay};
            case 8:
                return new int[]{R.drawable.tema8_button, R.raw.molotkompoebalu};
            case 9:
                return new int[]{R.drawable.tema9_button, R.raw.nonono};
            case 10:
                return new int[]{R.drawable.tema10_button, R.raw.nuclearreactor};
            case 11:
                return new int[]{R.drawable.tema11_button, R.raw.nudanuda};
            case 12:
                return new int[]{R.drawable.tema1_button, R.raw.nusmotri};
            case 13:
                return new int[]{R.drawable.tema2_button, R.raw.ohfuck};
            case 14:
                return new int[]{R.drawable.tema3_button, R.raw.ohfuck2};
            case 15:
                return new int[]{R.drawable.tema4_button, R.raw.rebyat};
            case 16:
                return new int[]{R.drawable.tema5_button, R.raw.screeeeeam};
            case 17:
                return new int[]{R.drawable.tema6_button, R.raw.sharaga};
            case 18:
                return new int[]{R.drawable.tema7_button, R.raw.skatynaebanaya};
            case 19:
                return new int[]{R.drawable.tema8_button, R.raw.solisten};
            case 20:
                return new int[]{R.drawable.tema9_button, R.raw.stupidcheater};
            case 21:
                return new int[]{R.drawable.tema10_button, R.raw.surrender};
            case 22:
                return new int[]{R.drawable.tema11_button, R.raw.tablyatskiawaper};
            case 23:
                return new int[]{R.drawable.tema1_button, R.raw.tayopto};
            case 24:
                return new int[]{R.drawable.tema2_button, R.raw.thisisshitnotasolution};
            case 25:
                return new int[]{R.drawable.tema3_button, R.raw.tryrust};
            case 26:
                return new int[]{R.drawable.tema4_button, R.raw.understood};
            case 27:
                return new int[]{R.drawable.tema5_button, R.raw.whatthefuckmotherfucker};
            case 28:
                 return new int[]{R.drawable.tema6_button, R.raw.yaposhel};
            case 29:
                return new int[]{R.drawable.tema7_button, R.raw.yesyesyes};
            case 30:
                return new int[]{R.drawable.tema8_button, R.raw.youbledina};
            case 31:
                return new int[]{R.drawable.tema9_button, R.raw.youcantdevide};
            case 32:
                return new int[]{R.drawable.tema10_button, R.raw.youweretoldtogo};
        }

        return new int[]{0,0};
    }

    
    public static int[][] getIdArray(){

        int[][] idArray = new int[buttonsNames.length][2];

        for (int i = 0; i < buttonsNames.length ;i++) {
            idArray[i] = getId(i);
        }

        return idArray;
    }
}