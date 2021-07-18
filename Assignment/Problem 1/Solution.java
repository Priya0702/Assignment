
class Solution{
    public static void main(String[] args) {
        
    } 
   
        public int romanToInt(String s) {
            if (s == null)
                return 0;
            
            Map<Character, Integer> rn = new HashMap<Character, Integer>(){
                {
                    put('I', 1);
                    put('V', 5);
                    put('X', 10);
                    put('L', 50);
                    put('C', 100);
                    put('D', 500);
                    put('M', 1000);
                }
            };
    
            int prev = rn.get(s.charAt(0));
            int res = prev;
            
            for (int i = 1; i < s.length(); i++) {
                int cur = rn.get(s.charAt(i));
                res+= cur;
                
                if (cur > prev) {
                    res -= 2*prev;
                }   
                prev = cur;    
            }
                
            return res;
        }
    }

