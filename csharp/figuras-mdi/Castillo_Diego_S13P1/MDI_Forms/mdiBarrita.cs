using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace Castillo_Diego_S13P1.MDI_Forms
{
    public partial class mdiBarrita : Form
    {
        public mdiBarrita()
        {
            InitializeComponent();
        }
        private void guna2Button1_Click(object sender, EventArgs e)
        {
            Progressbar1.Minimum = 1;
            Progressbar1.Maximum = 100;
            Progressbar1.Value = 100;


        }

        private void guna2CircleButton1_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
