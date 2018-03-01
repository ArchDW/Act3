import scala.collection.mutable.ArrayBuffer


object Promedio {
	var calParcia1 = 0.0
			var calParcia2 = 0.0
			var calParcia3 = 0.0
			var calParcia4 = 0.0
			var calMateria1 = 0.0
			var calMateria2 = 0.0
			var calMateria3 = 0.0
			var calMateria4 = 0.0
			var calMateria5 = 0.0
			var calMateria6 = 0.0
			var PromedioGeneral = 0.0

			def Parcial(vec1: Array[Int], vec2: Array[Int], vec3: Array[Int], vec4: Array[Int]): Unit={

					for(i <- 0 until vec1.length){
						calParcia1= calParcia1 + vec1(i)
						calParcia2= calParcia2 + vec2(i)
						calParcia3= calParcia3 + vec3(i)
						calParcia4= calParcia4 + vec4(i)
					}

					calParcia1 = calParcia1/vec1.length
							calParcia2 = calParcia2/vec2.length
							calParcia3 = calParcia3/vec3.length
							calParcia4 = calParcia4/vec4.length

							println("Promedio Pacial 1: "+ calParcia1)
							println("Promedio Pacial 2: "+ calParcia2)
							println("Promedio Pacial 3: "+ calParcia3)
							println("Promedio Pacial 4: "+ calParcia4)
	}  

	def Materia(vec1: Array[Int], vec2: Array[Int], vec3: Array[Int], vec4: Array[Int]): Unit={
			calMateria1=(vec1(0)+vec2(0)+vec3(0)+vec4(0))/4
					calMateria2=(vec1(1)+vec2(1)+vec3(1)+vec4(1))/4
					calMateria3=(vec1(2)+vec2(2)+vec3(2)+vec4(2))/4
					calMateria4=(vec1(3)+vec2(3)+vec3(3)+vec4(3))/4
					calMateria5=(vec1(4)+vec2(4)+vec3(4)+vec4(4))/4
					calMateria6=(vec1(5)+vec2(5)+vec3(5)+vec4(5))/4

					println("Promedio Materia 1: "+ calMateria1)
					println("Promedio Materia 2: "+ calMateria2)
					println("Promedio Materia 3: "+ calMateria3)
					println("Promedio Materia 4: "+ calMateria4)
					println("Promedio Materia 5: "+ calMateria5)
					println("Promedio Materia 6: "+ calMateria6)
	}    

	def PromedioGeneral(vec1: Array[Int], vec2: Array[Int], vec3: Array[Int], vec4: Array[Int]): Unit={
			for(i <- 0 until (vec1.length)){
				PromedioGeneral= PromedioGeneral + vec1(i) + vec2(i)+ vec3(i)+ vec4(i) 
			}
			
			PromedioGeneral= PromedioGeneral / (vec1.length+ vec2.length+ vec3.length+ vec4.length)
			
			println("Promedio General: "+ PromedioGeneral)
	}


	def main(args: Array[String]): Unit = {
			val Parcial1=     Array(70,80,97,71,80,98)
					val Parcial2= Array(70,89,98,75,87,96)
					val Parcial3= Array(70,81,92,73,84,95)
					val Parcial4= Array(75,82,93,75,86,98) 	



					Parcial(Parcial1, Parcial2, Parcial3, Parcial4)
					Materia(Parcial1, Parcial2, Parcial3, Parcial4)
					PromedioGeneral(Parcial1, Parcial2, Parcial3, Parcial4)
	}//End the Main
}//End the Object