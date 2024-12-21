package Programming;

import java.util.Scanner;

public class Pattern {
	
	static void hollowEquiTrianglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1+i;j++) {
				if(j==(n+1-i) || j==(n-1+i))
					System.out.print("*");
				else if(i==n && j%2==1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void hollowTriPattern(int n) {
		int space=n-1,star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;i<=space;i++) System.out.print("  ");
			
			space--; star++;
			System.out.println();
		}
	}
	
	
	static void hollowTrianglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1+i;j++) {
				if(j==(n+1-i) || j==(n-1+i) || i==n)
					System.out.print("* ");
//				else if(i==n && j%2==1) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	

	static void indexPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
					System.out.print("("+i+","+j+") ");
			}
			System.out.println();
		}
		
	}
	
	static void plusPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
					if((n+1)/2==i || (n+1)/2==j) {
						System.out.print("* ");
					}
					else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void rectanglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void rect2Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n || i==2 || j==2 || i==(n-1) || j==(n-1))
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void rect3Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n || (n+1)/2==i || (n+1)/2==j)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void rect4Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n || i==j || (i+j)==(n+1))
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void swastikPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( (n+1)/2==i || (n+1)/2==j || (i==1 && (n+1)/2<j) || (j==1 && (n+1)/2>i) || (i==n && (n+1)/2>j) || (j==n && (n+1)/2<i) )
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void rightAngleTrianglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i>=j)
					System.out.print("* ");
				//6else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void rightAngleTriangle2Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=(n-i))
					System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void equiTri2Pattern(int n) {
		int star=1,space=(n+1)/2-1;
		for(int i=1;i<=(n+1)/2;i++) {
          
        	   for(int j=1;j<=space;j++)
        		   System.out.print("  "); 
        	   for(int j=1;j<=star;j++)
        		   System.out.print("* "); 
        	   space--; star++;
        	   System.out.println();
        	   
           } 
           
		 star=(n+1)/2-1;
  	   space=1;
           for(int i=0;i<=(n-(n+1)/2);i++){
        	   for(int j=1;j<=space;j++)
        		   System.out.print("  "); 
        	   for(int j=1;j<=star;j++)
        		   System.out.print("* ");
        	   space++;star--;
        	   System.out.println();
           }
			
		
	}
	
	
	static void equiTriPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((n+2)/2>=i)
					System.out.print("* ");
				else if(j<=(n-i+1))
					System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	
	static void damruPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((n+1)/2>=i) {
				if((j-i)>=0 && (i+j)<=(n+1))
					System.out.print("* ");
				else 
					System.out.print("  ");
				}
				else {
					if((j-i)<=0 && (i+j)>=(n+1))
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	

	static void equiTri3Pattern(int n) {
		for(int i=1;i<=n;i++) {
			char c='A';
			for(int j=1;j<=n;j++) {
				if(j<=(n-i))
					System.out.print("  ");
				else {System.out.print(c+"   "); c++;}
			}
			System.out.println();
		}
	}
	
	static void equiTriAlphaPattern(int n) {
	    int star=1, space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
		     star+=2; space--;
			System.out.println();
		}
	}
	
	static void diamondPattern(int n) {
		if(n%2==0) {
		System.out.println("Diamond pattern not possible!"); return;
		}
	    int star=1, space=(n+1)/2-1;
	    // upper half
		for(int i=1;i<=(n+1)/2;i++) {
			for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
		     star+=2; space--;
			System.out.println();
		}
		// lower half
		space=1; star=n-2;
		for(int i=(n+1)/2+1;i<=n;i++) {
			for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
		     star-=2; space++;
			System.out.println();
		}
	}
	
	static void rhombusPattern(int n) {
	    int star=2*n-1, space=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
		     star-=2; space++;
			System.out.println();
		}
	}
	
	static void horiPyramidPattern(int n) {
	    int star=1, space=0;
		for(int i=1;i<=n;i++) {
			//for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
			if(i<(n+1)/2) star++;
			else 
		     star--; //space++;
			System.out.println();
		}
	}
	
	static void horiPyramid2Pattern(int n) {
	    int star=1, space=(n+1)/2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
			if(i<(n+1)/2) { star++;space--;}
			else 
			{ star--; space++;}
			System.out.println();
		}
	}
	
	
	static void damru2Pattern(int n) {
	    int star=9, space=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) System.out.print("  ");
			for(int j=1;j<=star;j++) System.out.print("* ");
			if(i<(n+1)/2) { star-=2;space++;}
			else 
			{ star+=2; space--;}
			System.out.println();
		}
	}
	
	static void damru3Pattern(int n) {
		// method 1
	    int star=1, space=n-2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i<=(n+2)/2 && (j-i)>0 && (i+j)<(n+1))
				System.out.print("  ");
			else if(i>(n+2)/2 && (j-i)<0 && (i+j)>(n+1))
				System.out.print("  ");
			else System.out.print("* ");
				
			}
			// method 2
//			for(int j=1;j<=star;j++) System.out.print("* ");
//			for(int j=1;j<=space;j++) System.out.print("  ");
//			for(int j=1;j<=star;j++) System.out.print("* ");
//			if(i<(n+1)/2) { star++;space-=2;}
//			else 
//			{ star--; space+=2;}
			System.out.println();
		}
	}

	public static void numberPattern(int n) {
		int space=n-1,star=1,cnt=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++)
				System.out.print("   ");
			for(int j=1;j<=star;j++)
				System.out.printf("%3d",cnt++);
			space--;star++;
			System.out.println();
		}
	}
	
	public static void number2Pattern(int n) {
		int space=n-1,star=1,cnt=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++)
				System.out.print("   ");
			cnt+=(i-1)*2+1;
			for(int j=1;j<=star;j++)
				System.out.printf("%3d",cnt--);
			space--;star++;
			System.out.println();
		}
	}
	
	public static void numberDiamondPattern(int n) {
		int space=(n+1)/2,star=1,cnt=1;
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=space;j++)
				System.out.print("   ");
			//cnt+=(i-1)*2+1;
			for(int j=1;j<=star;j++)
				System.out.printf("%3d",cnt++);
		if(i<(n+1)/2) {
			space--; star+=2;
		}
		else {
				space++;star-=2;
			}
			System.out.println();
		}
	}
	
	public static void bigPattern(int n) {
		int mid=(n+1)/2,space=mid-1,midStar=n-2,startspace=0,lastStar=1;
		for(int i=1;i<=n;i++) {
			// section 1
		   for(int j=1;j<=mid;j++) {
			   if(j<=space)
				   System.out.print("  ");
			   else System.out.print("* ");
		   }
		   if(i<mid) space--;
		   else space++;
		   
		   // section 2
		   for(int j=mid+1;j<=2*mid;j++) {
			   if(i<=mid && (i==1 || j==(2*mid)))
				   System.out.print("@ ");
			   else System.out.print("  ");
		   }
		   
		  // section 3
		   
			   if(i>mid ) {
				  for(int k=1;k<=startspace;k++)
					  System.out.print("  ");
				  for(int k=1;k<=midStar;k++)
					  System.out.print("* ");
				  for(int k=1;k<=startspace;k++)
					  System.out.print("  ");
				  midStar-=2; startspace++;
				  
			   }else {
				   for(int j=1;j<=n-2;j++)
				   System.out.print("  ");
				   }
			   
			   // section4
			   for(int j=n*2;j<=n*2+mid-1;j++) {
				   if(i<=mid && j==2*n || i==1) System.out.print("@ ");
				   else System.out.print("  ");
			   }
			   
			   // section 5
			   for(int j=1;j<=lastStar;j++) {
				   System.out.print("* ");
			   }
			   if(i<mid) lastStar++;
			   else lastStar--;
			   
			   
		   System.out.println();
		}
	}
	
	static void big2Pattern(int n) {
		// section 1
		int sStarpos=n,lStarpos=n , eStarpos=4*n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
			if(j>=sStarpos && j<=lStarpos) {
				System.out.print("* ");
			}else System.out.print("  ");}
			sStarpos--; lStarpos++;
			
			// section 2
			for(int j=2*n;j<=3*n-1;j++) {
				if(j==2*n || j==(3*n-1) || i==n)
					System.out.print("@ ");
				else System.out.print("  ");
			}
			
			// section 3
			for(int j=3*n;j<=4*n-2+i;j++) {
				if(j>=eStarpos)
					System.out.print("* ");
				else System.out.print("  ");
			}
			eStarpos--;
			System.out.println();
		}
	}
	
	 static void big3Pattern(int n) {
		// section 1
		int mid=(n+1)/2,mspace=mid-1,malpha=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("* ");
				else System.out.print("  ");
			}
			
			// section 2
		  for(int j=1;j<=mspace;j++)
			  System.out.print("  ");
		  for(int j=1;j<=malpha;j++)
			  System.out.print("@ ");
		  for(int j=1;j<=mspace;j++)
			  System.out.print("  ");
		  if(i<mid) {
			  malpha+=2;mspace--;
		  }else {
			  malpha-=2;mspace++;
		  }
		  
		  //section 3
		  for(int j=2*n+1;j<=3*n;j++) {
			  if(i==1 || i==n || j==2*n+1 || j==3*n)
					System.out.print("* ");
				else System.out.print("  ");
		  }
			
			System.out.println();
		}
	}
	
	static void big4Pattern(int n) {
		int mid=(n+1)/2, sStarpos=mid,eStarpos=mid,lStarpos=(3*n+mid-1),leStarpos=(3*n+mid-1);
		for(int i=1;i<=n;i++) {
			// section 1
			for(int j=1;j<=n;j++) {
				if(j>=sStarpos && j<=eStarpos)
					System.out.print("* ");
				else System.out.print("  ");
			}
			if(i<mid) {
				eStarpos++; sStarpos--;
			}else {
				eStarpos--; sStarpos++;
			}
			
			// section 2
			for(int j=n+1;j<3*n;j++) {
				if(j>=(2*n-i+1) && j<=(2*n-1+i))
					System.out.print("@ ");
				else System.out.print("  ");
			}
			
			// section 3
			for(int j=3*n;j<4*n;j++) {
				if(j>=lStarpos && j<=leStarpos)
					System.out.print("* ");
				else System.out.print("  ");
			}
			if(i<mid) {
				leStarpos++; lStarpos--;
			}else {
				leStarpos--; lStarpos++;
			}
			System.out.println();
		}
	}
	
	static void big5Pattern(int n) {
		int mid1=(n+1)/2 ,mid=(mid1+1)/2, sStarpos=mid,eStarpos=mid,lStarpos=(3*mid1+mid-1),leStarpos=(3*mid1+mid-1);
		int sAlphapos=n+1,eAlphapos=n+1;
		for(int i=1;i<=n;i++) {
			// section 1
			for(int j=1;j<=mid1;j++) {
				if(i<=(mid1) && j>=sStarpos && j<=eStarpos)
					System.out.print("* ");
				else System.out.print("  ");
			}
			if(i<mid) {
				eStarpos++; sStarpos--;
			}else {
				eStarpos--; sStarpos++;
			}
			
			// section 2
			for(int j=mid1+1;j<3*mid1;j++) {
				if(i<=mid1 && j>=sAlphapos && j<=eAlphapos)
					System.out.print("@ ");
				else if(i>mid1 && j>=sAlphapos && j<=eAlphapos)
					System.out.print(j%2+" ");
				else System.out.print("  ");
			}
			if(i<mid1) {
				sAlphapos--;eAlphapos++;
			}else {
				sAlphapos++;eAlphapos--;
			}
			
			// section 3
			for(int j=3*mid1;j<4*mid1;j++) {
				if(i<=(mid1) && j>=lStarpos && j<=leStarpos)
					System.out.print("* ");
				else System.out.print("  ");
			}
			if(i<mid) {
				leStarpos++; lStarpos--;
			}else {
				leStarpos--; lStarpos++;
			}
			System.out.println();
		}
	}
	
	static void big6Pattern(int n) {
		for(int i=1;i<=n;i++) {
			if(i<=n/3) {
				for(int j=1;j<=n/3+i-1;j++) {
					if(j>=(n/3-i+1))
						System.out.print("@ ");
					else System.out.print("  ");
				}
			}
			else {
				for(int j=1;j<=n/3+i-1;j++)
				if(j>=(n/3-1) && j<=(n/3+1))
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void missilePattern(int n) {
		int mid=(n+1)/2,sStarpos=1,eStarpos=n,ssStarpos=2*n+1,eeStarpos=3*n;
		for(int i=1;i<=2*n-1;i++) {
			// section 1
			for(int j=1;j<=n;j++)
				if(i>=(2*n-mid) && j>=sStarpos && eStarpos>=j)
					System.out.print("*");
				else System.out.print(" ");
			if(i>=(2*n-mid)) {sStarpos++;eStarpos--;}
			
			// section 2
			
			for(int j=n+1;j<=2*n;j++) {
				if(i<=mid) {
					if(j>=(n+mid-i+1) && j<=(n+mid+i-1))
						System.out.print("*");
					else System.out.print(" ");
				}else if(i>mid && i<=(n+mid-1) && (j==(n+1) || j==(2*n))) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			
			// section 3
			for(int j=2*n+1;j<=3*n;j++)
				if(i>=(2*n-mid) && j>=ssStarpos && eeStarpos>=j)
					System.out.print("*");
				else System.out.print(" ");
			if(i>=(2*n-mid)) {ssStarpos++;eeStarpos--;}
			
			System.out.println();
		}
	}
	
	static void big7Pattern(int n) {
		for(int i=1;i<=(3*n);i++) {
			for(int j=1;j<=n*n-n+3;j++) {
				if(j==1 && i<=(n+1) ||(j==(n-1)*n+3 && i>=(2*n)))
					System.out.print("@");
				else if(i>=(n+1) && i<=(2*n) && j>=(2+(i-n-1)*(n-1)) && j<=(2+(i-n)*(n-1)))
					System.out.print("*");
				else System.out.print(" ");
		}
			System.out.println();
		}
	}
	
	static void big8Pattern(int n) {
		int mid=n/2+1;
		for(int i=1;i<=n+(n/2)*2;i++) {
			for(int j=1;j<=n*n-n+3;j++) {
				if(j==1 && i<=(n+1) ||(j==(n-1)*n+3 && i>=(mid+1)))
					System.out.print("@");
				else if(i>=mid && i<=(mid+n-1) && j>=(2+(i-n-1+n/2)*(n-1)) && j<=(2+(i-n+n/2)*(n-1)))
					System.out.print("*");
				else System.out.print(" ");
		}
			System.out.println();
		}
	}
	
	static void pascalPattern(int n) {
		int arr[][]=new int[n][n],space=n-1;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=space;j++)
				System.out.printf("   ");
			space--;
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j)
					arr[i][j]=1;
				else arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				System.out.printf("%3d", arr[i][j]);
				System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n=sc.nextInt();
		System.out.println("missilePattern");
		missilePattern(n);
		System.out.println("pascalPattern");
		pascalPattern(n);
		System.out.println("big8Pattern");
		big8Pattern(n+1);
		System.out.println("big7Pattern");
		big7Pattern(n);
		System.out.println("big6Pattern");
		big6Pattern(n);
		System.out.println("big5Pattern");
		big5Pattern(n);
		System.out.println("big4Pattern");
		big4Pattern(n);
		System.out.println("big3Pattern");
		big3Pattern(n);
		System.out.println("big2Pattern");
		big2Pattern(n);
		System.out.println("bigPattern");
		bigPattern(n);
		System.out.println("numberDiamondPattern");
		numberDiamondPattern(n);
		System.out.println("  number2Pattern");
      number2Pattern(n);
      System.out.println(" numberPattern");
      numberPattern(n);
      System.out.println("	damru3Pattern");
		damru3Pattern(n);
		System.out.println("horiPyramid2Pattern");
		horiPyramid2Pattern(n);	
		System.out.println("horiPyramidPattern");
		horiPyramidPattern(n);	
		System.out.println("diamondPattern");
      diamondPattern(n);
      System.out.println("	equiTriAlphaPattern");
   	//equiTriOpPattern(n);
		equiTriAlphaPattern(n);
		System.out.println("hollowTrianglePattern");
		hollowTrianglePattern(n);
		System.out.println("hollowEquiTrianglePattern");
		hollowEquiTrianglePattern(n);
		System.out.println("indexPattern");
		indexPattern(n);
		System.out.println("plusPattern");
		plusPattern(n);
		System.out.println("rectanglePattern");
		rectanglePattern(n);
		System.out.println("rect2Pattern");
		rect2Pattern(n);
		System.out.println("rect3Pattern");
		rect3Pattern(n);
		System.out.println("rect4Pattern");
		rect4Pattern(n);
		System.out.println("swastikPattern");
		swastikPattern(n);
		System.out.println("rightAngleTrianglePattern");
		rightAngleTrianglePattern(n);
		System.out.println("rightAngleTriangle2Pattern");
		rightAngleTriangle2Pattern(n);
		System.out.println("equiTriPattern");
		equiTriPattern(n);
		System.out.println("equiTri2Pattern");
		equiTri2Pattern(n);
		System.out.println("	damruPattern");
		damruPattern(n);
		System.out.println("equiTri3Pattern");
		equiTri3Pattern(n);
		System.out.println();
	

	}

}
