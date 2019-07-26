# java-examples
All java examples in this repo

### Example 1 ☕
---
- Computing the solutions of the quadratic equation: 


   ![math-20190726 (1)](https://user-images.githubusercontent.com/33956266/61977369-fcd2cd80-aff6-11e9-9f84-da89873ad8b0.png)

       
by transforming cbxax cbxax the algorithm sketched in the figure below into a Java program. The program shall output the solution with a formatted string, or, if a solution cannot be obtained, with a descriptive text message, respectively. 
 
 
![sasa](https://user-images.githubusercontent.com/33956266/61975230-3c96b680-aff1-11e9-9df6-853fdffa8ce8.JPG)
--
### Example 2 ☕
---
* A Java program shall be created which calculates the bending moment distribution of a twofield beam using the ω-approach. The following values shall be read from the user (standard
input): The lengths l1 and l2 [m], the moments of intertia ly1 und ly2 [m^4] and the corresponding loads q1 and q2 [kN/m] of both fields.

![frr](https://user-images.githubusercontent.com/33956266/61975801-c2ffc800-aff2-11e9-86f1-ef54d02c9660.JPG)

- The values of the bending moment shall be evaluated at n points of each beam and be printed
as a formatted string. Additionally, the number of the (n − )1 steps shall be read as user input at
the beginning of the computation. The screenshot shows the formatted output of values of the
x-axis and the corresponding bending moment My(x), separated by tabs. 
For the calculation of the bending moment My(x), the ratio of the moments of inertia j of both
fields and the supporting moment Mb over the middle support are required: 
####### ![vfvf](https://user-images.githubusercontent.com/33956266/61977533-5cc97400-aff7-11e9-9065-cf67c81156dc.JPG)

 * The bending moment distribution My(x)can be evaluated successively at both fields with: 
 
 ###### ![vfvfvf](https://user-images.githubusercontent.com/33956266/61977733-f42ec700-aff7-11e9-8be6-a21c2ba579f3.JPG)


### Example 3 ☕
---
* Write a program that creates a text file that contains a power of two table in HTML format. The file could be called twoPowerTable.html. When it is viewed with a browser you will see something like: 


<span style="display:block;text-align:center">![gtgtgtg](https://user-images.githubusercontent.com/33956266/61977996-a1094400-aff8-11e9-8e5f-3fa02db7ae68.JPG) </span>

The file should start with something like: 

  ```sh
<html><head>
<title>Powers of Two</title>
</head>
<body>
<table border cellpadding=5>
<tr><th>Power of 2</th><th>Value</th></tr>
 ```
And end with:
 ```sh
</table>
</body></html>
 ```
 Each line of the table looks like: 
 ```sh
 <tr><td>0</td><td>1</td></tr>
  ```
