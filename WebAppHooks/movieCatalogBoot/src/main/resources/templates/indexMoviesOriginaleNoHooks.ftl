<!DOCTYPE html>
<html>
	<head>
		<title>Movies Catalog</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
	</head>
	<body>
		<h1>Movies Catalog</h1>
		
		
		<#if movieToUpdate??>
		<h2>Updating movie - ${movieToUpdate.nome_film}</h2>
			<div style="margin 20px;">
				<form method="POST" action="update" id="datiMovie">
					<input type="hidden" name="id" value="${movieToUpdate.id}" />
					<div>
						<label for="nome_film">Film name</label>
						<input type="text" name="nome_film" id="nome_film" value="${movieToUpdate.nome_film}" />
					</div>
					<div>
						<label for="nome_utente">User name</label>
						<input type="text" name="nome_utente" id="nome_utente" value="${movieToUpdate.nome_utente}" />
					</div>
					<div>
						<label for="valutazione">Valuation</label>
						<input type="number" name="valutazione" id="valutazione" value="${movieToUpdate.valutazione}" />
					</div>
					<div>
						<input type="submit" name="sendMovieData" value="Save changes" />
					</div>
				
				
				</form>
			</div>
		<#else>
		<h2>New movie</h2>
			<div style="margin 20px;">
				<form method="POST" action="add" id="datiMovie">
					<div>
						<label for="nome_film">Film name</label>
						<input type="text" name="nome_film" id="nome_film" value="" />
					</div>
					<div>
						<label for="nome_utente">User name</label>
						<input type="text" name="nome_utente" id="nome_utente" value="" />
					</div>
					<div>
						<label for="valutazione">Valuation</label>
						<input type="number" name="valutazione" id="valutazione" value="" />
					</div>
					<div>
						<input type="submit" name="sendMovieData" value="Add" />
					</div>
				
				
				</form>
			</div>

		</#if>
		
		
		<hr>
		
		<h2>Movies List</h2>
		<div>
			<table>
				<thead>
					<tr>
						<th>Film</th>
						<th>User</th>
						<th>Valuation</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<#list MoviesList as movie>
					<tr>
						<td>${movie.nome_film}</td>
						<td>${movie.nome_utente}</td>
						<td>${movie.valutazione}</td>
						<td>
							<a href="delete?id=${movie.id}">Delete</a>
							<a href="movie?id=${movie.id}">Update</a>
						</td>
					</tr>
					</#list>
				</tbody>
			</table>
		</div>
	</body>
</html>
		
