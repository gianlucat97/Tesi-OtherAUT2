<!DOCTYPE html>
<html>
	<head>
		<title x-test-tpl-1>Movies Catalog</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous" x-test-tpl-2>
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
	</head>
	<body>
		<h1 x-test-tpl-3>Movies Catalog</h1>
		
		
		<#if movieToUpdate??>
		<h2 x-test-tpl-4>Updating movie - ${movieToUpdate.nome_film}</h2>
			<div style="margin 20px;" x-test-tpl-5>
				<form method="POST" action="update" id="datiMovie" x-test-hook-6>
					<input type="hidden" name="id" value="${movieToUpdate.id}" x-test-hook-7 />
					<div x-test-hook-8>
						<label for="nome_film" x-test-hook-9>Film name</label>
						<input type="text" name="nome_film" id="nome_film" value="${movieToUpdate.nome_film}" x-test-hook-10 />
					</div>
					<div x-test-hook-11>
						<label for="nome_utente" x-test-hook-12>User name</label>
						<input type="text" name="nome_utente" id="nome_utente" value="${movieToUpdate.nome_utente}" x-test-hook-13 />
					</div>
					<div x-test-hook-14>
						<label for="valutazione" x-test-hook-15>Valuation</label>
						<input type="number" name="valutazione" id="valutazione" value="${movieToUpdate.valutazione}" x-test-hook-16 />
					</div>
					<div x-test-hook-17>
						<input type="submit" name="sendMovieData" value="Save changes" x-test-hook-18 />
					</div>
				
				
				</form>
			</div>
		<#else>
		<h2 x-test-tpl-19>New movie</h2>
			<div style="margin 20px;" x-test-tpl-20>
				<form method="POST" action="add" id="datiMovie" x-test-hook-21>
					<div x-test-hook-22>
						<label for="nome_film" x-test-hook-23>Film name</label>
						<input type="text" name="nome_film" id="nome_film" value="" x-test-hook-24 />
					</div>
					<div x-test-hook-25>
						<label for="nome_utente" x-test-hook-26>User name</label>
						<input type="text" name="nome_utente" id="nome_utente" value="" x-test-hook-27 />
					</div>
					<div x-test-hook-28>
						<label for="valutazione" x-test-hook-29>Valuation</label>
						<input type="number" name="valutazione" id="valutazione" value="" x-test-hook-30 />
					</div>
					<div x-test-hook-31>
						<input type="submit" name="sendMovieData" value="Add" x-test-hook-32 />
					</div>
				
				
				</form>
			</div>

		</#if>
		
		
		<hr x-test-tpl-33>
		
		<h2 x-test-tpl-34>Movies List</h2>
		<div x-test-tpl-35>
			<table x-test-hook-36>
				<thead x-test-hook-37>
					<tr x-test-hook-38>
						<th x-test-hook-39>Film</th>
						<th x-test-hook-40>User</th>
						<th x-test-hook-41>Valuation</th>
						<th x-test-hook-42>Actions</th>
					</tr>
				</thead>
				<tbody x-test-hook-43>
					<#list MoviesList as movie>
					<tr x-test-hook-44>
						<td x-test-hook-45>${movie.nome_film}</td>
						<td x-test-hook-46>${movie.nome_utente}</td>
						<td x-test-hook-47>${movie.valutazione}</td>
						<td x-test-hook-48>
							<a href="delete?id=${movie.id}" x-test-hook-49>Delete</a>
							<a href="movie?id=${movie.id}" x-test-hook-50>Update</a>
						</td>
					</tr>
					</#list>
				</tbody>
			</table>
		</div>
	</body>
</html>
		
