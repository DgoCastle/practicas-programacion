using Castillo_Diego_S13P1.MDI_Forms;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Castillo_Diego_S13P1
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void progressbarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form formulario = new mdiBarrita();
            formulario.MdiParent = this;  //Main es padre y tipo MDI
            formulario.Show(); //Llama a Form AltaClientes adentro de Form Main
        }

        private void Main_Load(object sender, EventArgs e)
        {

        }

        private void perimetroToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form formulario = new mdiPerimetro();
            formulario.MdiParent = this;  //Main es padre y tipo MDI
            formulario.Show(); //Llama a Form AltaClientes adentro de Form Main
        }

        private void areaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form formulario = new mdiArea();
            formulario.MdiParent = this;  //Main es padre y tipo MDI
            formulario.Show(); //Llama a Form AltaClientes adentro de Form Main
        }

        private void acercaDeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form bajaclientes = new FormAcercaDe();
            bajaclientes.Show(); //Llama a Form AltaClientes fuera  de Form Main
        }
    }
}
