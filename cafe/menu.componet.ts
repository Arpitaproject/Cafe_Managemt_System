@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html'
})
export class MenuComponent implements OnInit {
  menu: MenuItem[] = [];
  newItem: MenuItem = { name: '', price: 0, category: '' };

  constructor(private menuService: MenuService) {}

  ngOnInit(): void {
    this.loadMenu();
  }

  loadMenu() {
    this.menuService.getMenu().subscribe(data => this.menu = data);
  }

  addItem() {
    this.menuService.addItem(this.newItem).subscribe(() => {
      this.newItem = { name: '', price: 0, category: '' };
      this.loadMenu();
    });
  }

  deleteItem(id: number) {
    this.menuService.deleteItem(id).subscribe(() => this.loadMenu());
  }
}

