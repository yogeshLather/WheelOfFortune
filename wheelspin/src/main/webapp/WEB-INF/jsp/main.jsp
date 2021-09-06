<!DOCTYPE html>
<html>
  <head>
    <title>Play - Wheel of fortune</title>
    <meta charset="UTF-8" />
    <link rel="stylesheet" type="text/css" href="css/styles.css" />
  </head>

  <body>
    <div id="app">
      <img class="marker" src="images/marker.png" />
      <img class="wheel" src="images/wheel.png" />
      <img class="button" src="images/button.png" />
      <select name="WheelElements" id="guess">
		  <option value="Frog">Frog</option>
		  <option value="Snail">Snail</option>
		  <option value="Dolphin">Dolphin</option>
		  <option value="Ladybug">Ladybug</option>
		  <option value="Koala">Koala</option>
		  <option value="Unicorn">Unicorn</option>
		  <option value="Dragon">Dragon</option>
		  <option value="Snowman">Snowman</option>
		</select> <br>
      <div class="display">-</div>
    </div>

    <script src="js/script.js"></script>
  </body>
</html>