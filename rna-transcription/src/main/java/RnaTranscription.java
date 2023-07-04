class RnaTranscription {
    String transcribe(String dnaStrand) {
        int len = dnaStrand.length();
        String ans = new String("");
        for (int i = 0; i < len; i++) {
            char nucleotide = dnaStrand.charAt(i);
            switch (nucleotide) {
                case 'A':
                    ans+='U';
                    break;
                case 'C':
                    ans+='G';
                    break;
                case 'G':
                    ans+='C';
                    break;
                case 'T':
                    ans+='A';
                    break;
            }
        }
        return ans;
    }
}
