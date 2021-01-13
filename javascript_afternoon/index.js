function f(ar,f2,sum)
{
	let a=0;
	for(var i=0;i<ar.length;i++)
	{
		a=sum(a,ar[i]);
	}
	return a;
}
var k=f([1,2,3,4,5],0,(p,q)=>p+q);
console.log(k);
document.getElementById("assignment").innerHTML=k;
