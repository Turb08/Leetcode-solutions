class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> Dict = new HashMap<>();
        Dict.put('I', 1);
        Dict.put('V', 5);
        Dict.put('X', 10);
        Dict.put('L', 50);
        Dict.put('C', 100);
        Dict.put('D', 500);
        Dict.put('M', 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int current = Dict.get(s.charAt(i));
            if(i < s.length() -1 && current < Dict.get(s.charAt(i + 1))){
                sum -= current;
            }
            else{
                sum +=current;
            }
        }
        return sum;
    }
}

//add a dictionary to store key value pairs
//move to a for -> if loop and check if the constraints are vaild
//find the relevant value of the keys and add/substract them
//output the result