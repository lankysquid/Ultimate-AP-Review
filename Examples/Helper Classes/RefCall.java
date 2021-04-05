//Unit 5 Lesson 3
class RefCall { 
    int a;
    int b; 
    public RefCall(int x, int y) 
    { 
        a = x; 
        b = y; 
    } 
    public void ChangeVal(RefCall obj)
    { 
        obj.a += 30; 
        obj.b += 50; 
    } 
} 
