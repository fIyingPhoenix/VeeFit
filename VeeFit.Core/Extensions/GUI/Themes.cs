using MudBlazor;

namespace VeeFit.Core.Extensions.GUI
{

    public class Themes
    {
        public static PaletteLight LightTheme()
        { 
            return VeeFitlightPalette; 
        }
        public static PaletteDark DarkTheme()
        {
            return VeeFitdarkPalette;
        }
        private static readonly PaletteLight VeeFitlightPalette = new()
        {
            Primary = "#1367F2",
            Secondary = "#1E88E5",
            Surface = "#FFFFFF",
            Background = "#F5F5F7",
            BackgroundGray = "#F0F0F2",
            AppbarText = "#424242",
            AppbarBackground = "rgba(255,255,255,0.95)",
            DrawerBackground = "#FFFFFF",
            ActionDefault = "#757575",
            ActionDisabled = "#9E9E9E4D",
            ActionDisabledBackground = "#BDBDBD4D",
            TextPrimary = "#212121",
            TextSecondary = "#616161",
            TextDisabled = "#00000033",
            DrawerIcon = "#616161",
            DrawerText = "#424242",
            GrayLight = "#EEEEEE",
            GrayLighter = "#F5F5F5",
            Info = "#4A86FF",
            Success = "#3DCB6C",
            Warning = "#FFB545",
            Error = "#FF3F5F",
            LinesDefault = "#E0E0E0",
            TableLines = "#E1E1E1",
            Divider = "#EEEEEE",
            OverlayLight = "#F5F5F780",
        };
        private static readonly PaletteDark VeeFitdarkPalette = new()
        {
            Primary = "#1367F2",
            Secondary = "#42A5F5",
            Surface = "#2D2D3A",
            Background = "#252533",
            BackgroundGray = "#2A2A38",
            AppbarText = "#E0E0E0",
            AppbarBackground = "rgba(37,37,51,0.9)",
            DrawerBackground = "#2D2D3A",
            ActionDefault = "#ADADB7",
            ActionDisabled = "#FFFFFF4D",
            ActionDisabledBackground = "#BDBDBD4D",
            TextPrimary = "#FFFFFF",
            TextSecondary = "#C0C0CA",
            TextDisabled = "#FFFFFF40",
            DrawerIcon = "#B0B0B0",
            DrawerText = "#E0E0E0",
            GrayLight = "#383845",
            GrayLighter = "#32323F",
            Info = "#4A86FF",
            Success = "#3DCB6C",
            Warning = "#FFB545",
            Error = "#FF3F5F",
            LinesDefault = "#43425A",
            TableLines = "#43425A",
            Divider = "#3A394D",
            OverlayLight = "#2D2D3A80",
        };
    }
}
