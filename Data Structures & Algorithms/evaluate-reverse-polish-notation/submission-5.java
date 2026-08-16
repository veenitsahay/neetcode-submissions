class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deq = new ArrayDeque();
        int res = 0;
        //tokens=["4","13","5","/","+"]
// 13/5 = 2 + 4 = 6

        for(String str: tokens){
            if(!str.equals( "+" ) && !str.equals("/") && !str.equals("*") && !str.equals("-")){
                deq.addFirst(Integer.parseInt(str));
            }else{
                int num1 = deq.pop(), num2 = deq.pop();

                switch(str){
                    case "+" -> deq.addFirst( num2 + num1);
                    case "-" -> deq.addFirst(num2 - num1);
                    case "*" -> deq.addFirst(num2 * num1);
                    case "/" -> deq.addFirst(num2 / num1);
                }
            }
        }

        return deq.pop();        
    }
}
