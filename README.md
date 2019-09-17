# Programmerstasken
method main located in Programmerstasken/src/Programmerstasken.java

I wanted to keep the code as simple as possible.

I divided the functionality into classes so that they can be easily tracked and changed if needed.

I decided to implement C (waiting time line) and D (query) as objects. 
Yes, it slows down processing speed, but gives you more options to handle this data, makes it more flexible.

Since the basic query (D data in Request.java) and answer (C data in Respond.java) variables are the same. 
I just created an abstract class (dataClass.java) and basic methods for the objects in it. 
And just expanded the base class constructor for Respond.java. 

In the fileWork.java class, I just implemented a simple download
and uploading the final data to files. Everything is standard. 
You can overwrite it for the server or just access it from mail as needed.

I also wanted to implement a data analysis algorithm for compliance and more sophisticated data collection with more tests. 
But it will reduce the speed of execution. 
Therefore, I have decided not to include it in the final version yet and implement it  for myself on the weekend, 
when I will make it optimal in processing time =)

Alternatively, can implement multithreading at the time of the data loop analysis (line 50 in Programmerstasken.java), 
but this also needs to be further tested for speed. Therefore, without a guarantee of performance, I have not yet included in the version 0.1
