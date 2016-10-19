package MendelsFirstLaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.midi.Sequence;

	public class MendelFirstLaw  {
		public static final double TT = 22;
		public static final double Tt = 17;
		public static final double tt = 27;
		public static double s1p = 0;
		public static double s2p = 0;
		public static double s3p = 0;
		public static double s4p = 0;
		public static double tp = 0;
		public static void main(String[] args){
			double totalpop = TT+Tt+tt;
			Stageone(totalpop);
			Stagetwo(totalpop);
			Stagethree(totalpop);
			Stagefour(totalpop);
			end();

			

		}
		public static void Stageone(double totalpop) {
			double p1;
			double p2;
			double op;
			p1=tt/totalpop;
			p2= (tt-1)/(totalpop-1);
			op = 1;
			s1p = p1*p2*op;
			
		System.out.println(s1p);
		}
		public static void Stagetwo(double totalpop) {
			double p1;
			double p2;
			double op;
			p1=Tt/totalpop;
			p2= (tt)/(totalpop-1);
			op = .5;
			s2p = p1*p2*op;
			
		System.out.println(s2p);
		}
		public static void Stagethree(double totalpop) {
			double p1;
			double p2;
			double op;
			p1=tt/totalpop;
			p2= (Tt)/(totalpop-1);
			op = .5;
			s3p = p1*p2*op;
			
		System.out.println(s3p);
		}
		public static void Stagefour(double totalpop) {
			double p1;
			double p2;
			double op;
			p1=Tt/totalpop;
			p2= (Tt-1)/(totalpop-1);
			op = .25;
			s4p = p1*p2*op;
			
		System.out.println(s4p);
		}
		public static void end() {
			tp = s1p+s2p+s3p+s4p;
			System.out.println(1-tp);
		}
	
	}
			



