document.addEventListener('DOMContentLoaded', () => {
  const layoutHTML = `
    <!-- Barra superior -->
    <div class="top-bar">
      <div class="empresa-logo">
        Projeto Recriar
      </div>
      <div class="sair">
        <a href="login.html">Sair</a>
      </div>
    </div>

    <!-- Menu lateral -->
    <div class="menu-lateral">
      <nav>
        <ul>
          <li><a href="menu.html">Início</a></li>
          <li><a href="alunos.html">Alunos</a></li>
          <li><a href="professores.html">Professores</a></li>
          <li><a href="turmas.html">Turmas</a></li>
          <li><a href="aulas.html">Aulas</a></li>
          <li><a href="admin.html">Admin</a></li>
        </ul>
      </nav>
    </div>
  `;

  const container = document.getElementById('menu-container');
  if (container) container.innerHTML = layoutHTML;
});
