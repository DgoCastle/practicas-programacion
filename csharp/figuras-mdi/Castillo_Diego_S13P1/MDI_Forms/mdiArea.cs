using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Castillo_Diego_S13P1.MDI_Forms
{
    public partial class mdiArea : Form
    {
        public mdiArea()
        {
            InitializeComponent();
        }

        private void guna2Button1_Click(object sender, EventArgs e)
        {
            double H, B;
            double resultado;

            H = Convert.ToDouble(txtAltura.Text);
            B = Convert.ToDouble(txtBase.Text);
            resultado = (B * H) / 2;

            MessageBox.Show("Su resultado es:" + resultado);



        }
    }
}
