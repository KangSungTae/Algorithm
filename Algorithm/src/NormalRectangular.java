
public class NormalRectangular {

	public static void main(String[] args) {
		 
		System.out.println(""+gcd(4,8));
		System.out.println(""+solution(12,8));
	}
	
	
    public static long solution(int w, int h) {
        long answer = 1;
        
        long line = 0;
        int gcdArg = gcd(w,h);
         
        answer = (long)w*(long)h - ((long)w + (long)h - (long)gcdArg);
        
        return answer;
    }
	
    /* 단일 함수로 풀이했을경우 시간복잡도 ↓ */ 
    public static int gcd(int w, int h) {
        
    	int answer = 1;
        
    	int big = w > h ? w : h;
    	int small = w < h ? w : h;
        
        while(true) {
        	int a = big % small ;
        	int b = small;
        	big = b;
        	small = a;
        	if(a == 0) {
        		return b;
        	}
        } 
    }
    
    /* 재귀함수로 풀이했을경우 시간복잡도 ↑ */ 
    public static int gcdRecursive(int w, int h) {
        int answer = 1;
        int a = 0;
        int b = 0;
        
        if(w > h) {
        	a = w%h;
        	b = h;
        	if(a == 0) {
        		return b;
        	}
        }else if(h > w){
        	a = h%w;
        	b = w;
        	if(a == 0) {
        		return b;
        	}
        }
        return gcd(a,b);
    }
}
