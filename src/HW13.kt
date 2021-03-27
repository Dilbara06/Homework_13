fun main(){
    val a = arrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    val n= a.size
    for (j in 1..(n-1)){
        var f=0
        for (i in 0..(n-1-j)){
            if (a[i]>a[i+1]){
                var e1=a[i]
                var e2=a[i+1]
                a[i]=e2
                a[i+1]=e1
                f=1
            }
        }
        if (f==0) break
    }
    for (i in a.indices){
        print(" ${a[i]} " )
    }

}