Final Project – Report
Swarm Computing – Travelling Salesman Problem
Particle Swarm Optimization | Firefly Algorithm
Aayush Srivastava | Rajasi Akolkar | Soumya Pandey



 

Swarm intelligence (SI) is the collective behaviour of decentralized, self-organized systems, natural or artificial. The concept is employed in work on artificial intelligence. The expression was introduced by Gerardo Beni and Jing Wang in 1989, in the context of cellular robotic systems.
SI systems consist typically of a population of simple agents interacting locally with one another and with their environment. The inspiration often comes from nature, especially biological systems. The agents follow very simple rules, and although there is no centralized control structure dictating how individual agents should behave, local, and to a certain degree random, interactions between such agents lead to the emergence of "intelligent" global behaviour, unknown to the individual agents. Examples of swarm intelligence in natural systems include ant colonies, bird flocking, hawks hunting, animal herding, bacterial growth, fish schooling and microbial intelligence.







Particle Swarm Optimization
 
The particle swarm optimization was originally presented by Kennedy and Eberhart, it has been compared with Genetic Algorithm, it is inspired by social behavior among individuals, these individuals are moving through an n-dimensional search space, each particle represents a potential solution of the problem, and can remember the best position it has reached. All the particles can share their information about the search space, so there is a global best solution. In each of iteration, every particle calculates its velocity according to the formula.
The basic PSO model consists of a swarm of particles, which are initialized with a population of random candidate solutions. They move iteratively through the d-dimension problem space to search for the new solutions, where the fitness, f, can be calculated as the certain qualities measure. Each particle has a position represented by a position-vector xi (i is the index of the particle), and a velocity represented by a velocity-vector vi.  Each particle remembers its own best position so far in a vector i-th, and its d-dimensional value is pbest(pid). The best position-vector among the swarm so far is then stored in the vector i-th, and its d-th dimensional value is gbest(pgd). During the iteration time t, the update of the velocity (vid) from the previous velocity to the new velocity is determined by Eq. (1). The new position (xid) is then determined by the sum of the previous position and the new velocity by Eq.
V(id+1) = w *vid + c1 *r1* (pgd -xid) +c2 * r2 * (pid -xid) 
X(id+1) = xid + v(id+1)        
where i =1,2,…..,N; w is the inertia weight, r1 and r2 are the random numbers, which are used to maintain the diversity of the population, and are uniformly distributed in the interval [0,1]  for  the  d-th  dimension  of  the i-th  particle.  C1 is a positive constant, called coefficient of the self-recognition component; c2 is a positive constant, called coefficient of the social component. From Eq. (1), a particle decides where to move next, considering its own experience, which is the memory of its best past position, and the experience of its most successful particle in the swarm. In order to guide the particles effectively in the search space, the maximum moving distance during one iteration must be clamped in between the maximum velocity [−vmax,vmax]. The general basic algorithm for the Particle Swarm Optimization can be described in algorithm (1): Algorithm (1) PSO Algorithm after Input: Initialize the algorithm parameters (c1, c2, w, vmax, Swarm_Size, Max_Iter,r1,r2).
Output: The optimization having the highest fitness as found
by PSO.
Step 1: Randomly generate the initial particles and velocities to form a swarm
Step 2: Calculate the fitness function of each of the particles. 
Step 3: If the current position of the particle is better than the previous history, update the particles to indicate this fact. 
Step 4:  Find the best particle of the swarm.  Update the positions of the particles by using equations (1) and (2). 
Step 5: If the maximum   number of iterations has exceeded or high fitness is found, then  go to step 6 or else go to step 2. 
Step 6: Copy the best value and exit. 


Firefly Algorithm
 
Firefly algorithm simulates the flash pattern and characteristics of fireflies. Clustering is a popular data analysis technique to identify homogeneous groups of objects based on the values of their attributes.
The Firefly Algorithm (FA) is a recent nature inspired technique, that has been used for solving nonlinear optimization problems. This algorithm is based on the behavior of social insects (fireflies).
It works on the following three assumptions:
1. All fireflies are single sex; so that a firefly is attract all other fireflies.
2. The attraction is proportional to the light, and for both firefly, dimmer firefly is attracted to lighter one.
3. If the firefly isn’t lighter than the other firefly then firefly will randomly move.
The Firefly algorithm was developed by Xin-She Yang and it is based on idealized behaviour of the flashing characteristics of fireflies. For simplicity, flashing characteristics can be summarized as the following three rules [7]: All fireflies are unisex, so that one firefly is attracted to other fireflies regardless of their sex. Attractiveness is proportional to their brightness, thus for any two flashing fireflies, the less bright one will move towards the brighter one. The attractiveness is proportional to the brightness and they both decrease as their distance increases.  If no one is brighter than a particular firefly, it will move randomly. The brightness of a firefly is affected or determined by the landscape of the objective function to be optimized. Based on these three rules, the basic steps of the firefly algorithm (FA) can be summarized as 
the pseudo code:
Begin 
     Initialize algorithm parameters: 
        Max Gen: the maximal number of generations 
        γ: the light absorption coefficient 
        r: the particular distance from the light source 
       d: the domain space 
  Define the objective function of f(x), where    
     x=(x1,.......,xd)T 
  Generate the initial population of fireflies  
   or xi (i=1, 2 ,..., n) 
   Determine the light intensity of Ii at xi via f(xi) 
      While (t < Max Gen) 
          For i = 1 to n (all n fireflies) 
          For j=1 to n (n fireflies) 
          if (Ij > Ii), move firefly i towards j; end if 
      Attractiveness varies with distance r via Exp [-γ r2]               
      Evaluate new solutions and update light intensity; 
                 End for j 
                 End for i 
      Rank the fireflies and find the current best; 
     End while 
           Post process results and Visualization 
     End


The Travelling Salesman Problem
 
The travelling salesman problem (TSP) asks the following question: "Given a list of cities and the distances between each pair of cities, what is the shortest possible route that visits each city and returns to the origin city?" It is an NP-hard problem in combinatorial optimization, important in operations research and theoretical computer science.
The travelling purchaser problem and the vehicle routing problem are both generalizations of TSP.
The problem was first formulated in 1930 and is one of the most intensively studied problems in optimization. It is used as a benchmark for many optimization methods. Even though the problem is computationally difficult, a large number of heuristics and exact algorithms are known, so that some instances with tens of thousands of cities can be solved completely and even problems with millions of cities can be approximated within a small fraction of 1%.
The TSP has several applications even in its purest formulation, such as planning, logistics, and the manufacture of microchips. Slightly modified, it appears as a sub-problem in many areas, such as DNA sequencing. In these applications, the concept city represents, for example, customers, soldering points, or DNA fragments, and the concept distance represents travelling times or cost, or a similarity measure between DNA fragments. The TSP also appears in astronomy, as astronomers observing many sources will want to minimize the time spent moving the telescope between the sources. In many applications, additional constraints such as limited resources or time windows may be imposed.



Conclusion
We tried to solve the travelling salesman problem with an optimization algorithm with less complexity in order to solve this problem with firefly algorithm with greedy approach and it was compared and examined with particle swarm optimization. The results show the superiority of firefly algorithm compared to particle swarm optimization.
Time complexity comparison(nsec)
For 30 particles
No of cities	Grid size	PSO	Firefly	Time Taken
		Iteration	Result	Iteration	Result	PSO	Firefly
100	1000	43	38406.36	100	25389.86	8599040	3770027
200	1000	20	94395.96	100	72837.09	10371840	4785920
300	1000	24	144533.02	100	121102.97	11009707	5732267
400	1000	83	192454.14	100	170587.44	18930347	6527573
500	1000	33	237497.59	100	219252.25	20466346	5850453

For 40 particles
No of cities	Grid size	PSO	Firefly	Time Taken
		Iteration	Result	Iteration	Result	PSO	Firefly
100	1000	88	43826.74	100	26803.96	10925654	4256427
200	1000	23	91685.95	100	72143.58	10303147	6013014
300	1000	3	143567.48	100	120262.35	10263893	6369707
400	1000	85	187546.79	100	168091.57	19362987	5838507
500	1000	38	244718.46	100	220996.12	13065387	7660373

For 50 particles
No of cities	Grid size	PSO	Firefly	Time Taken
		Iteration	Result	Iteration	Result	PSO	Firefly
100	1000	4	41647.96	100	26433.99	10785707	4415147
200	1000	65	85482.64	100	69035.13	13692160	4096426
300	1000	84	142239.95	100	120531.93	11224746	5327786
400	1000	98	189924.47	100	169413.4	13998507	6755840
500	1000	21	241007.06	100	218878.05	21703254	6783147


