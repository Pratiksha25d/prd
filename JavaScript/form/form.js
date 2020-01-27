document.getElementById("button").addEventListener("click",validate);

function validate()
{
	var name=document.getElementById("fname").value;
	var mob=document.getElementById("mob").value;
	var age=document.getElementById("age").value;

	if(name=''||mob==''||age=='')
	{
		alert("fields can't be empty");
	}
	else
	{
		var name_pattern=/[a-zA-Z]+/;
		var mob_pattern=/[7-9]{1}[0-9]{9}/;
		var age_pattern=/^[0-9]{2}$/;

		if(!name_pattern.test(name))
		{
			alert("name pattern should be matched");
		}
		if(!mob_pattern.test(mob))
		{
			alert("mobile pattern should be matched");
		}
		if(!age_pattern.test(age))
		{
			alert("age pattern should be matched");
		}
		


	}
}