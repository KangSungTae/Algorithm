#### 강성태의 알고리즘 풀이 공간
-----------------------------------

##### 이 REPO는 개인적으로 풀이한 프로그래머스 알고리즘 문제의 소스가 업로드 됩니다 ^^
-----------------------------------

##### > 목록  
1. scovileAlg - 더 맵게
+ Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
+ Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 
+ K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

> 프로그래머스 level2  최소 맵기를 만족하는 스코빌지수 / 배열로 구현 - 시간복잡도 효율성 저하로 fail

2. HeapAlg 
> 1의 scovileAlg를 Heap으로 구현 - Heap방식은 시간복잡도가 O(NlogN)로 수렴하여 효율성을 만족한다. 
> Java의 PriorityQueue를 사용하여 구현


3. KaKaoBlind - 괄호변환
+ 프로그래머스 레벨2 카카오블라인드 알고리즘 - 소괄호의 짝을 맞추는 것
+ 지문이 복잡하나, 지문대로 알고리즘을 구현할 경우 쉽게 통과할 수 있다.


4. TipStart - 예상대진표
+ 프로그래머스 레벨2 - 예상 대진표 - A와 B가 대전하기 위해 승리해야 하는 총 회수를 구하라.
+ 모두 2의 N승이므로 input값 a와 b의 2의 mod값과 나눈값을 적절히 활용하면 쉽게 만들 수 있다.


5. NormalRectangular - 멀쩡한 사각형 
+ 프로그래머스 레벨2 - 가로의 길이 W와 세로의 길이 H가 주어질 때, 사용할 수 있는 
+ 정사각형의 개수를 구하는 solution 함수를 완성해 주세요.


> 패턴문제로 지문예제가 적어 testcase를 직접 그려가며 규칙을 찾아야 한다. 
>> 규칙 : 직사각형 8*12 를 대각으로 가로지르는 선이 그어질때 꼭지점과 꼭지점이 만나는 지점은 [2,3] , [4,6] , [6,9] , [8,12] 와 같다.
>> 따라서 최대공약수 4를 구했을때  8/4 = 2 / 12/4 = 3 * 2와 3만큼 반복되는 것을 알 수 있다. 
>>> 또한, 정사각형 [[0,0],[2,3]] 에서 선이 그어져 사용하지 못하는 사각형은 4개로 2+3-1인 것을 알 수 있다. 해당 패턴을 가진 사각형이 최대공약수만큼
>>> 반복되므로 2*gcd + 3*gcd - 1*gcd => w + h - gcd 이다. 단, gcd의 경우 재귀함수로 구할 시 시간복잡도의 증가로 알고리즘 실패가 발생되니 주의할 것!

6. bracketAlgo - 괄호 회전하기 (월간코드 챌린지)
+ 프로그래머스 레벨 2 - 대중소 괄호로 이루어진 제시된 문자열을 길이만큼 좌측으로 이동할 경우 생성되는 완벽한 괄호의 개수를 구하라. 
> Stack 을 활용하는 문제로 열린 괄호는 스택에 ADD하고 닫힌 괄호가 나올 경우이면서 Peek된 값이 짝을 이룰 경우에만 Stack에서 해당 괄호를 Pop한다.

7. CoupleWordRemove - 문자열 짝 제거하기
+ 프로그래머스 레벨 2 - 나열된 알파벳 문자열 중 중복으로 나타나는 알파벳의 쌍을 제거해나갈 때 모든 알파벳이 제거 가능하면 1 아니면 0을 반환한다.
> 스택을 활용하여 스택에 들어간 char와 다음에 read 된 char가 동일할 경우 stack을 pop 한다. stack의 사이즈가 0일 경우 전부 제거 가능.
