<html>
<head>
<title>WAVE Web Application Visual Environment</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script language="JavaScript"><!--
	var dom="je"+"nsgu";
	var addr="ma";
	dom+="lden";
	addr+="il";
	function nospam(){var link="mailto:"+addr+"@"+dom+".de";window.open(link);}
	function nospam_status(){var st=addr+"@"+dom+".de";window.status="Send a mail to "+st+" (spam-save JavaScript link).";}
//--></script>
</head>

<?php

$menu = array(
	"overview"	=> array("label"=>"Overview"),
	"example"	=> array("label"=>"Examples"),
	"install"	=> array("label"=>"Installation"),
	"doc"		=> array("label"=>"Documentation"),
	"project"	=> array("label"=>"Project Site", "url"=>"http://developer.berlios.de/projects/wave/")
);

function menuItem($item)
{
	global $menu;
	$m = $menu[$item];
	$l = $m["label"];
	$url = $m["url"];
	if ( ! $url )
	{
		$url = "?page=".$item;
	}
	
	$selected = ($_REQUEST["page"] == $item);
	
	if ($selected)
	{
		return "<div class='wave menu selected'>".$l."</div>";
	}
	else
	{
		return "<div class='wave menu unselected'><a href='".$url."'>".$l."</a></div>";
	}
}

?>

<body class="wave">
<div class="page">
	<div class="logo"><img class="logo" src="img/wave-logo.png"/></div>
	<div class="pageContent">
		<h1 class="title">WAVE &ndash; Web Application Visual Environment</h1>
		<h3 class="subtitle">Model-Driven Development (MDD) for the Zend Web Application Framework</h3>
		<div class='main'>
		<?php
			if (!$_REQUEST["page"])	{ $_REQUEST["page"] = "overview"; }

			// menu
			echo("<div class='menubar'>");
			foreach ($menu as $key=>$val)
			{
				echo( menuItem($key) );
			}
			echo("</div>");

			// content
			echo("<div class='content'>");
			include("content/".$_REQUEST["page"].".inc");
			echo("</div>");
		?>
		</div>
		
		<div class="license">
			Licensed under the <a href='http://www.gnu.org/licenses/gpl.txt' target='_blank'>GNU General Public License</a> (GPL).
		</div>

		<div class="credits">
		&copy; 
		<a href="sendmail" 
		   onclick="nospam();return false" 
		   onmouseover="/*nospam_status();*/ window.status='Hallo'; return true;" 
		   onmouseout="window.status='';return true">Jens Gulden</a> 2009
		</div>
		
	</div>
	<div style="clear:both"/>
</div>	
<div class="hosted">Hosted on <a href="http://developer.berlios.de/projects/wave/"><img src="http://developer.berlios.de/sflogo.php?group_id=11002" border="0" height="16" width="62"></a></div>

</body>
</html>
