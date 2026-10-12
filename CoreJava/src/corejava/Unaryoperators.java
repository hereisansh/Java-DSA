package corejava;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

        //POST INCREMENT PRACTICE QUESTIONS

        public class Unaryoperators {
	    public static void main(String[] args)
	    {
		int x = 8; 
		int y = x++;
		System.out.println("Question 1");
		System.out.println(x);
		System.out.println(y);
		
		
		int r = 10; 
		int s = r++; 
		s = r++;
		System.out.println("Question 2");
		System.out.println(r); 
		System.out.println(s); 
		
		
		int a = 20; 
		a++;
		int b = a++; 
		b = a++; 
		b++;
		a = b++; 
		System.out.println("Question 3");
		System.out.println(a); 
		System.out.println(b);
		
		
		int p = 25;
		int q = p++;
		q++;
		p = q++; 
		int z = p++;
		q = z++;
		p = z++;
		p++; 
		q = p++;
		z = q++;
		q = q++; 
		System.out.println("Question 4");
		System.out.println(p); 
		System.out.println(q); 
		System.out.println(z);
		
		
		int i = 55;
		int j = i++;
		j++;
		int k = j++;
		i = k++; 
		j = k++; 
		System.out.println("Question 5");
		System.out.println(i); 
		System.out.println(j); 
		System.out.println(k);
		
        //PRE INCREMENT PRACTICE QUESTIONS
		
		int l = 20;
		int m = ++l;
		System.out.println("Question 1");
		System.out.println(l); 
		System.out.println(m);
		
		
		int mm = 100;
		++mm;
		int nn = ++mm;
		int oo = ++nn;
		++oo;
		System.out.println("Question 2");
		System.out.println(mm);
		System.out.println(nn); 
		System.out.println(oo); 
		
		
		int v = 45;
		++v;
		int w = ++v;
		++w;
		v = ++w;
		v++;
		System.out.println("Question 3");
		System.out.println(v); 
		System.out.println(w); 
		
		//POST DECREMENT PRACTICE QUESTIONS:
		
		int pp = 20;
		int qq = pp--;
		System.out.println("Question 1");
		System.out.println(pp); 
		System.out.println(qq);
		
		
		int xx = 95;
		xx--;
		int yy = xx--;
		yy = yy--;
		System.out.println("Question 2");
		System.out.println(xx); 
		System.out.println(yy); 
		
		
		int aa = 50;
		int bb = aa--;
		bb--;
		int cc = bb--;
		aa = cc--;
		bb = cc--;
		bb--;
		System.out.println("Question 3");
		System.out.println(aa); 
		System.out.println(bb); 
		System.out.println(cc);
		
		//PRE DECREMENT PRACTICE QUESTIONS:
		
		int xxx = 20;
		int yyy = --xxx;
		--xxx;
		System.out.println("Question 1");
		System.out.println(xxx); 
		System.out.println(yyy); 
		
		
		int aaa = 10;
		--aaa;
		int bbb = --aaa;
		System.out.println("Question 2");
		System.out.println(aaa); 
		System.out.println(bbb); 
		
		
		int op = 215;
		--op;
		int po = --op;
		--po;
		int to = --po;
		op = --to;
		po = --to;
		System.out.println("Question 3");
		System.out.println(op);
		System.out.println(po);
		System.out.println(to); 
		
		//MISCELLANEOUS PRACTICE QUESTIONS:
		
		int mM = 8;
		++mM;
		int nN = ++mM;
		nN--;
		int pP = nN--;
		mM = pP--;
		nN = pP++;
		System.out.println("Question 1");
		System.out.println(mM); 
		System.out.println(nN); 
		System.out.println(pP); 
		
		
		int Aa = 7;
		++Aa;
		int Bb = ++Aa;
		Bb--;
		int Cc = Bb--;
		Aa = Cc++;
		Bb = Cc--;
		System.out.println(Aa); 
		System.out.println(Bb); 
		System.out.println(Cc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
