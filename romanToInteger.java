class Solution {
    public int romanToInt(String s) {
        char[] sp = s.toCharArray();
        int total = 0;
        for (int i = 0; i < sp.length; i++){
            //System.out.print(sp[i]);
            if (i < sp.length -1){
                if (sp[i] == 'C' && sp[i+1] == 'M'){
                    total +=900;
                    i++;
                    continue;
                }
                if(sp[i] == 'C' && sp[i+1] == 'D'){
                    total +=400;
                    i++;
                    continue;
                }
                if(sp[i] == 'X' && sp[i+1] == 'C'){
                    total +=90;
                    i++;
                    continue;
                }
                if(sp[i] == 'X' && sp[i+1] == 'L'){
                    total +=40;
                    i++;
                    continue;
                }
                if(sp[i] == 'I' && sp[i+1] == 'X'){
                    total +=9;
                    i++;
                    continue;
                }
                if(sp[i] == 'I' && sp[i+1] == 'V'){
                    total +=4;
                    i++;
                    continue;
                }
            }
            if (sp[i] == 'M'){
                total += 1000;
            }
            else if(sp[i] == 'D'){
                total += 500;
            }
            else if(sp[i] == 'C'){
                total += 100;
            }
            else if(sp[i] == 'L'){
                total += 50;
            }
            else if(sp[i] == 'X'){
                total += 10;
            }
            else if(sp[i] == 'V'){
                total += 5;
            }
            else{
                total += 1;
            }
            
        }
        return total;
    }

    public static void main(String[] args){
        Solution k = new Solution();
        int x = k.romanToInt("III");
        System.out.println(x);
    }
}

// instead of this split could I extract all the spots that have CM XC VX IV