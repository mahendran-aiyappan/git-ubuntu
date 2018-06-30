package org.woodworks;

import com.google.caliper.Benchmark;
import com.google.caliper.Param;
import com.google.caliper.api.VmOptions;

@VmOptions("-XX:-TieredCompilation")
public class FactorialBenchmark{
	@Param({
		"5",
		"10",
		"20",
	}) int number;
	@Benchmark long recursive(int rep){
		int number=this.number;
		long dummy=0L;
		for (int i=0; i<rep; i++){
			dummy |= Factorial.recursive(number);
		}
		return dummy;
	}

	@Benchmark long iterative(int rep){
		int number=this.number;
		long dummy=0L;
		for (int i=0; i<rep; i++){
			dummy |= Factorial.iterative(number);
		}
		return dummy;
	}
}
