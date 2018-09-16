function love.load()
	x = 0
	y = 0
	image = love.graphics.newImage("/Images/chicorita.jpg")
	love.graphics.setBackgroundColor(0, 0, 0, 255)
end

function love.draw()
	love.graphics.draw(image, x, y)

end

function love.update(dt)
   	if love.keyboard.isDown("up") then
      	y = max (0, y - 100 * dt)
   	end

   	if love.keyboard.isDown("down") then
   		y = min (300, y + 100 * dt)
   	end

   	if love.keyboard.isDown("right") then
   		x = min (500, x + 100 * dt)
   	end

   	if love.keyboard.isDown("left") then
   		x = max (0, x - 100 * dt)
   	end

end

function min(a, b)
	local res
	if a < b then 
		res = a
	else
		res = b
	end
	return res
end

function max(a, b)
	local res
	if a > b then 
		res = a
	else
		res = b
	end
	return res
end